import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public String timezone;
	public int id;
	public String end_time;
	public String logo;
	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public VersionModel _version;
	public String start_time;
	public String description;
	public String organizer_name;
	public String email;

	public RootModel(CreatorModel creator, String privacy, CopyrightModel copyright, String location_name, String timezone, int id, String end_time, String logo, String code_of_conduct, String topic, String schedule_published_on, String organizer_description, ArrayList<Social_linksModel> social_links, String background_image, String type, String state, Call_for_papersModel call_for_papers, String name, VersionModel version, String start_time, String description, String organizer_name, String email) {

		this._creator = creator;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this.end_time = end_time;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}