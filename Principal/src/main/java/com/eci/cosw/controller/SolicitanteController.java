package com.eci.cosw.controller;

import com.eci.cosw.model.Solicitante;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/solicitante")
public class SolicitanteController {

    /*@RequestMapping(value = "/{idSolicitante}", method = RequestMethod.GET)
    public List<Solicitante> getSolicitanteById(@PathVariable("idSolicitante") Integer idSolicitante) {return taskStub.getTasks(); }

    @RequestMapping(value = "/{cedula}", method = RequestMethod.GET)
    public List<Solicitante> getSolicitanteByCedula(@PathVariable ("cedula") Integer cedula) { return taskStub.getTasks(); }*/
    }
