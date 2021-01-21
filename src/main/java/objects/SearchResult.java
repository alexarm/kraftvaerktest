package objects;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SearchResult {
    public String link;
    public String header;
    public String name;
}
