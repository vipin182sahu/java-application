import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String location_name;
	public String topic;
	public String type;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String description;
	public int id;
	public String schedule_published_on;
	public String organizer_name;
	public String name;
	public String state;
	public VersionModel _version;
	public String timezone;
	public String privacy;
	public String end_time;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public String email;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String logo, String location_name, String topic, String type, CopyrightModel copyright, String code_of_conduct, String description, int id, String schedule_published_on, String organizer_name, String name, String state, VersionModel version, String timezone, String privacy, String end_time, String background_image, String organizer_description, String start_time, String email) {

		this._creator = creator;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.location_name = location_name;
		this.topic = topic;
		this.type = type;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this._version = version;
		this.timezone = timezone;
		this.privacy = privacy;
		this.end_time = end_time;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.email = email;

	}

}