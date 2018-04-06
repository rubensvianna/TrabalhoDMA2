package com.example.rubens.trabalhodma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterCarros extends BaseAdapter{
    Context contexto;
    List<Carros> listaCarros;

    public AdapterCarros(Context contexto, List<Carros> listaCarros) {
        this.contexto = contexto;
        this.listaCarros = listaCarros;
    }

    @Override
    public int getCount() {
        return listaCarros.size();
    }

    @Override
    public Object getItem(int position) {
        return listaCarros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaCarros.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(contexto).inflate(R.layout.linha_lista_carros, parent,false);
        ImageView imagemCarro = (ImageView) viewLinha.findViewById(R.id.imageViewCarro);
        TextView nome = (TextView) viewLinha.findViewById(R.id.textViewNome);
        TextView marca = (TextView) viewLinha.findViewById(R.id.textViewMarca);
        TextView modelo = (TextView) viewLinha.findViewById(R.id.textViewModelo);
        TextView ano = (TextView) viewLinha.findViewById(R.id.textViewAno);
        TextView preco = (TextView) viewLinha.findViewById(R.id.textViewPreco);
        TextView telefone = (TextView) viewLinha.findViewById(R.id.textViewTelefone);

        Carros carro = listaCarros.get(position);

        imagemCarro.setImageResource(carro.getImagem());
        nome.setText(carro.getNome());
        marca.setText(carro.getMarca());
        modelo.setText(carro.getModelo());
        ano.setText(carro.getAno());
        preco.setText(carro.getPreco());
        telefone.setText(carro.getTelefone());

        return viewLinha;
    }
}
