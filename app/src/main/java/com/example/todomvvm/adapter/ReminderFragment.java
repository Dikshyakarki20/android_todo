package com.example.todomvvm.adapter;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todomvvm.R;
import com.example.todomvvm.addedittask.AddEditTaskActivity;
import com.example.todomvvm.database.TaskEntry;
import com.example.todomvvm.tasks.MainActivity;
import com.example.todomvvm.tasks.MainActivityViewModel;
import com.example.todomvvm.tasks.TaskAdapter;
import com.example.todomvvm.tasks.TaskDateViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


public class ReminderFragment extends Fragment implements TaskAdapter.ItemClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String TAG = MainActivity.class.getSimpleName();
    // Member variables for the adapter and RecyclerView
    private RecyclerView mRecyclerView;
    private TaskAdapter mAdapter;
    TaskDateViewModel viewModel;


    public ReminderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     * @return A new instance of fragment TodolistFragment.
     */
    // TODO: Rename and change types and number of parameters


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(TaskDateViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todolist, container, false);
    }
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);


        // Set the RecyclerView to its corresponding view
        mRecyclerView = getView().findViewById(R.id.recyclerViewTasks);

        // Set the layout for the RecyclerView to be a linear layout, which measures and
        // positions items within a RecyclerView into a linear list
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Initialize the adapter and attach it to the RecyclerView
        mAdapter = new TaskAdapter(getContext(),this);
        mRecyclerView.setAdapter(mAdapter);

        DividerItemDecoration decoration = new DividerItemDecoration(getActivity().getApplicationContext(), DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(decoration);

        /*
         Add a touch helper to the RecyclerView to recognize when a user swipes to delete an item.
         An ItemTouchHelper enables touch behavior (like swipe and move) on each ViewHolder,
         and uses callbacks to signal when a user is performing these actions.
         */
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            // Called when a user swipes left or right on a ViewHolder
            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                // Here is where you'll implement swipe to delete

                int position = viewHolder.getAdapterPosition();
                List<TaskEntry> todoList = mAdapter.getTasks();
                viewModel.deleteTask(todoList.get(position));
            }
        }).attachToRecyclerView(mRecyclerView);

        /*
         Set the Floating Action Button (FAB) to its corresponding View.
         Attach an OnClickListener to it, so that when it's clicked, a new intent will be created
         to launch the AddTaskActivity.
         */
        FloatingActionButton fabButton = getView().findViewById(R.id.fab);

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to start an AddTaskActivity
                Intent addTaskIntent = new Intent(getActivity(), AddEditTaskActivity.class);
                startActivity(addTaskIntent);
            }
        });

        viewModel.getTodayTasks().observe(getActivity(), new Observer<List<TaskEntry>>() {
            @Override
            public void onChanged(List<TaskEntry> taskEntries) {
                mAdapter.setTasks(taskEntries);
            }
        });
    }

    @Override
    public void onItemClickListener(int itemId) {
        // Launch AddTaskActivity adding the itemId as an extra in the intent
        Intent intent = new Intent(getActivity(), AddEditTaskActivity.class);
        intent.putExtra(AddEditTaskActivity.EXTRA_TASK_ID, itemId);
        startActivity(intent);
    }
}
