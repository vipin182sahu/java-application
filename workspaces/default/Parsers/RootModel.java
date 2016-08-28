import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String state;
	public String timezone;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public int id;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String topic;
	public String name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(CreatorModel creator, String state, String timezone, String description, ArrayList<Social_linksModel> social_links, String type, String schedule_published_on, String logo, String privacy, int id, String start_time, String organizer_description, String organizer_name, String topic, String name, CopyrightModel copyright, String code_of_conduct, String background_image, VersionModel version, String end_time, String location_name, Call_for_papersModel call_for_papers, String email) {

		this._creator = creator;
		this.state = state;
		this.timezone = timezone;
		this.description = description;
		this.social_links = social_links;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.name = name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}