package com.example.calculater.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculater.R;
import com.example.calculater.databinding.FragmentCalculaterBinding;

import java.util.ArrayList;


public class CalculaterFragment extends Fragment {
    private ArrayList<Double> sayilar= new ArrayList<Double>();
    private int sayi = 0;
    private int sayi1 = 0;
    private String sonuc = "0";
    private String sayiString = "";
    private String sayiString2 = "0";
    private FragmentCalculaterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCalculaterBinding.inflate(inflater, container, false);

        binding.button0.setOnClickListener(view -> {
            binding.editTextSonuc.append("0");
            binding.textSayi.append("0");
        });
        binding.button1.setOnClickListener(view -> {
            binding.editTextSonuc.append("1");
            binding.textSayi.append("1");
        });
        binding.button2.setOnClickListener(view -> {
            binding.editTextSonuc.append("2");
            binding.textSayi.append("2");
        });
        binding.button3.setOnClickListener(view -> {
            binding.editTextSonuc.append("3");
            binding.textSayi.append("3");
        });
        binding.button4.setOnClickListener(view -> {
            binding.editTextSonuc.append("4");
            binding.textSayi.append("4");
        });
        binding.button5.setOnClickListener(view -> {
            binding.editTextSonuc.append("5");
            binding.textSayi.append("5");
        });
        binding.button6.setOnClickListener(view -> {
            binding.editTextSonuc.append("6");
            binding.textSayi.append("6");
        });
        binding.button7.setOnClickListener(view -> {
            binding.editTextSonuc.append("7");
            binding.textSayi.append("7");
        });
        binding.button8.setOnClickListener(view -> {
            binding.editTextSonuc.append("8");
            binding.textSayi.append("8");
        });
        binding.button9.setOnClickListener(view -> {
            binding.editTextSonuc.append("9");
            binding.textSayi.append("9");
        });
        binding.buttonToplama.setOnClickListener(view -> {
            binding.textSayi.append("+");
            sayi = Integer.parseInt(binding.editTextSonuc.getText().toString());
            binding.editTextSonuc.setText("");
            sayi1 = sayi1+sayi;
            //binding.textSonuc.setText(String.valueOf(sayi1));
        });
        binding.buttonTemizleme.setOnClickListener(view -> {
            binding.textSayi.setText("");
            binding.editTextSonuc.setText("");
            sayi = 0;
            sayi1 = 0;
        });

        binding.buttonSonuc.setOnClickListener(view -> {
            sayi = Integer.parseInt(binding.editTextSonuc.getText().toString());
            sayi1 = sayi1 + sayi;
            binding.editTextSonuc.setText(String.valueOf(sayi1));
            sayi1 = 0;
        });



        return binding.getRoot();
    }

    public String toplama(String x, String y){
        double toplam = 0;
        double sayi1 = Double.parseDouble(x);
        double sayi2 = Double.parseDouble(y);

        String toplamSt = Double.toString(toplam);
        return toplamSt;
    }

    public double aktarma(String gelenSayi){
        double x = Double.parseDouble(gelenSayi);
        return x;
    }
}