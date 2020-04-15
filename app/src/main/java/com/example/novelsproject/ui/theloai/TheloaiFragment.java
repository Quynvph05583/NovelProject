package com.example.novelsproject.ui.theloai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.novelsproject.R;

public class TheloaiFragment extends Fragment {

    private TheloaiViewModel Theloai;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        Theloai =
                ViewModelProviders.of(this).get(TheloaiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_theloai, container, false);
        final TextView textView = root.findViewById(R.id.text_theloai);
        Theloai.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}