import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String location_name;
	public String timezone;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public String organizer_description;
	public String description;
	public String logo;
	public String schedule_published_on;
	public String state;
	public String start_time;
	public String privacy;
	public String email;
	public String topic;
	public String name;
	public String organizer_name;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, VersionModel version, String location_name, String timezone, CreatorModel creator, ArrayList<Social_linksModel> social_links, String type, String code_of_conduct, int id, String background_image, String organizer_description, String description, String logo, String schedule_published_on, String state, String start_time, String privacy, String email, String topic, String name, String organizer_name, String end_time, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this._version = version;
		this.location_name = location_name;
		this.timezone = timezone;
		this._creator = creator;
		this.social_links = social_links;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.privacy = privacy;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}