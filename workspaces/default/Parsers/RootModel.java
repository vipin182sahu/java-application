import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String name;
	public CreatorModel _creator;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String state;
	public String start_time;
	public String topic;
	public String email;
	public String location_name;
	public String logo;

	public RootModel(VersionModel version, String name, CreatorModel creator, String privacy, String timezone, String organizer_name, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, String description, String type, String schedule_published_on, String background_image, int id, String code_of_conduct, CopyrightModel copyright, String organizer_description, String state, String start_time, String topic, String email, String location_name, String logo) {

		this._version = version;
		this.name = name;
		this._creator = creator;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this.description = description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.email = email;
		this.location_name = location_name;
		this.logo = logo;

	}

}