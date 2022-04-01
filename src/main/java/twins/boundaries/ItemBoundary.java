package twins.boundaries;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ItemBoundary {
	private ItemIdBoundary itemId;
	private String type;
	private String name;
	private Boolean active;
	private Date createdTimestamp;
	private CreatedByBoundary createdBy;
	private LocationBoundary location;
	private Map<String,Object> itemAttributes;
	
	public ItemBoundary() {
		itemAttributes = new HashMap<>();
		createdBy = new CreatedByBoundary();
		location = new LocationBoundary();
		itemId = new ItemIdBoundary();
		active = new Boolean("false");
		
	}

	public ItemBoundary(ItemIdBoundary itemId, String type, String name, Boolean active, Date createdTimestamp,
			CreatedByBoundary createdBy, LocationBoundary location, Map<String, Object> itemAttributes) {
		this.itemId = itemId;
		this.type = type;
		this.name = name;
		this.active = active;
		this.createdTimestamp = createdTimestamp;
		this.createdBy = createdBy;
		this.location = location;
		this.itemAttributes = itemAttributes;
		
	}




	public ItemIdBoundary getItemId() {
		return itemId;
	}

	public void setItemId(ItemIdBoundary itemId) {
		this.itemId = itemId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public CreatedByBoundary getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(CreatedByBoundary createdBy) {
		this.createdBy = createdBy;
	}

	public LocationBoundary getLocation() {
		return location;
	}

	public void setLocation(LocationBoundary location) {
		this.location = location;
	}

	public Map<String, Object> getItemAttributes() {
		return itemAttributes;
	}

	public void setItemAttributes(Map<String, Object> itemAttributes) {
		this.itemAttributes = itemAttributes;
	}
	
	
	
	
	
	
	
	

}
