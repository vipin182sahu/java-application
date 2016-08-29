import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String schedule_published_on;
	public String location_name;
	public String end_time;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public String background_image;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public int id;
	public String state;
	public String start_time;
	public String description;
	public String topic;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(CreatorModel creator, String schedule_published_on, String location_name, String end_time, String name, String organizer_name, String organizer_description, String background_image, String timezone, String privacy, CopyrightModel copyright, VersionModel version, int id, String state, String start_time, String description, String topic, String type, Call_for_papersModel call_for_papers, String code_of_conduct, String logo, ArrayList<Social_linksModel> social_links, String email) {

		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this._version = version;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.social_links = social_links;
		this.email = email;

	}

}