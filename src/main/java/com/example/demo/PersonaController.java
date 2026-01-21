import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController{
    private List<Persona> personas = new ArrayList<>();

    @getMapping
    public List<Persona> listar(){
        return personas;
    }
    @PostMapping
    public Persona crear(@RequestBody Persona persona){
        personas.add(persona);
        return persona;
    }
}

