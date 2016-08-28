import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public String state;
	public CreatorModel _creator;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String name;
	public String topic;
	public String organizer_name;
	public String type;
	public String schedule_published_on;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;

	public RootModel(Call_for_papersModel call_for_papers, String logo, String description, String location_name, String privacy, String organizer_description, String start_time, String code_of_conduct, String state, CreatorModel creator, String email, String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, String name, String topic, String organizer_name, String type, String schedule_published_on, int id, String background_image, CopyrightModel copyright, String timezone) {

		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._creator = creator;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;

	}

}