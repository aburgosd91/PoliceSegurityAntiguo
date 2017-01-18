package com.nisira.view.Activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.nisira.gcalderon.policesecurity.R;
import com.nisira.view.Adapter.List_Adapter_OrdenServicio;

import java.util.ArrayList;
import java.util.List;


public class edt_OrdenServicio extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText txt_documento;
    private EditText txt_cliente;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public edt_OrdenServicio() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment edt_OrdenServicio.
     */
    // TODO: Rename and change types and number of parameters
    public static edt_OrdenServicio newInstance(String param1, String param2) {
        edt_OrdenServicio fragment = new edt_OrdenServicio();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edt__orden_servicio, container, false);
        txt_documento = (EditText)view.findViewById(R.id.txt_documento);
        txt_cliente = (EditText)view.findViewById(R.id.txt_cliente);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_os);

        txt_documento.setText("Orden Servicio Cliente");
        txt_cliente.setText("Olivia Peña Carlos Alberto");

        recyclerView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(lManager);
        List<String> lista = new ArrayList<>();
        lista.add("Prueba01");
        lista.add("Prueba01");
        lista.add("Prueba01");
        lista.add("Prueba01");
        lista.add("Prueba01");
        lista.add("Prueba01");
        lista.add("Prueba01");
        List_Adapter_OrdenServicio adapter = new List_Adapter_OrdenServicio(lista,getFragmentManager());
        recyclerView.setAdapter(adapter);


        return view;
    }



}
