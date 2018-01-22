package es.curso.springrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnuncioController {

	@RequestMapping("/anuncio")
	public Anuncio anuncios() {

		return new Anuncio("Pepe", "Vendo moto", "...");
	}
}
