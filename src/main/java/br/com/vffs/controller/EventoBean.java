
package br.com.vffs.controller;

import br.com.vffs.model.Evento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author valeria
 */
@Named
@SessionScoped
public class EventoBean implements Serializable{
    
    @Inject
    private Evento evento;
    
    private List<Evento> eventos = new ArrayList<>();
    
    public String adicionaEvento(){
        eventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
        clean();
        return "";
    }
    
    public void clean(){
        evento = new Evento();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }    
       
}
