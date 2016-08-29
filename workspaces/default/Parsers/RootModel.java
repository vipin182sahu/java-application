import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public VersionModel _version;
	public String email;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String code_of_conduct;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String start_time;
	public String end_time;
	public String background_image;
	public String schedule_published_on;
	public String topic;
	public String organizer_description;
	public String location_name;
	public String type;
	public String name;
	public String privacy;

	public RootModel(ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, VersionModel version, String email, CopyrightModel copyright, int id, String organizer_name, String code_of_conduct, String description, String timezone, Call_for_papersModel call_for_papers, String state, String start_time, String end_time, String background_image, String schedule_published_on, String topic, String organizer_description, String location_name, String type, String name, String privacy) {

		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this._version = version;
		this.email = email;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.privacy = privacy;

	}

}