import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String state;
	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public String type;
	public String background_image;
	public CreatorModel _creator;
	public String name;
	public String email;
	public String description;
	public String logo;
	public String code_of_conduct;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String location_name;
	public String start_time;

	public RootModel(Call_for_papersModel call_for_papers, int id, String privacy, String state, String end_time, String organizer_name, String schedule_published_on, String topic, String timezone, String type, String background_image, CreatorModel creator, String name, String email, String description, String logo, String code_of_conduct, VersionModel version, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String organizer_description, String location_name, String start_time) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.state = state;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this.type = type;
		this.background_image = background_image;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this.description = description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.social_links = social_links;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.start_time = start_time;

	}

}