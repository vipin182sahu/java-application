import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String state;
	public String timezone;
	public String name;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String email;
	public int id;
	public String description;
	public String logo;
	public String topic;
	public String end_time;
	public CreatorModel _creator;
	public String privacy;

	public RootModel(VersionModel version, String state, String timezone, String name, String background_image, Call_for_papersModel call_for_papers, String organizer_name, String type, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String location_name, String email, int id, String description, String logo, String topic, String end_time, CreatorModel creator, String privacy) {

		this._version = version;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this.email = email;
		this.id = id;
		this.description = description;
		this.logo = logo;
		this.topic = topic;
		this.end_time = end_time;
		this._creator = creator;
		this.privacy = privacy;

	}

}