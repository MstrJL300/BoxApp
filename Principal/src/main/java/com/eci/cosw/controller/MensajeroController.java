package com.eci.cosw.controller;


@RestController
@RequestMapping(value = "/mensajero")
public class MensajeroController {

    @RequestMapping(value = "/{idSolicitante}", method = RequestMethod.GET)
    public List<Solicitante> getSolicitanteById(@PathVariable("idSolicitante") Integer cedula) { /*return taskStub.getTasks();*/ }

    @RequestMapping(value = "/{cedula}", method = RequestMethod.GET)
    public List<Solicitante> getSolicitanteById(@PathVariable("cedula") Integer cedula) { /*return taskStub.getTasks();*/ }

}
