package com.dommyg.draganddraw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DragAndDrawFragment extends Fragment {
    static DragAndDrawFragment newInstance() {
        return new DragAndDrawFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drag_and_draw, container, false);
        setHasOptionsMenu(true);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.color_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_red:
                BoxDrawingView.setColor(1);
                break;
            case R.id.menu_blue:
                BoxDrawingView.setColor(2);
                break;
            case R.id.menu_green:
                BoxDrawingView.setColor(3);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
