import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String end_time;
	public String location_name;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public String timezone;
	public String email;
	public String topic;
	public CreatorModel _creator;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_name;
	public String logo;
	public int id;
	public String start_time;
	public String name;
	public String state;
	public String schedule_published_on;

	public RootModel(ArrayList<Social_linksModel> social_links, String description, Call_for_papersModel call_for_papers, String organizer_description, String end_time, String location_name, String background_image, String code_of_conduct, String privacy, String timezone, String email, String topic, CreatorModel creator, VersionModel version, CopyrightModel copyright, String type, String organizer_name, String logo, int id, String start_time, String name, String state, String schedule_published_on) {

		this.social_links = social_links;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this._creator = creator;
		this._version = version;
		this._copyright = copyright;
		this.type = type;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.name = name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;

	}

}