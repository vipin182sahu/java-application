import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String privacy;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public String end_time;
	public String email;
	public String type;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public int id;
	public String description;
	public String schedule_published_on;
	public String background_image;

	public RootModel(Call_for_papersModel call_for_papers, VersionModel version, String logo, String topic, String privacy, String location_name, ArrayList<Social_linksModel> social_links, String name, CopyrightModel copyright, String state, String start_time, String end_time, String email, String type, String timezone, CreatorModel creator, String organizer_description, String code_of_conduct, String organizer_name, int id, String description, String schedule_published_on, String background_image) {

		this._call_for_papers = call_for_papers;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.location_name = location_name;
		this.social_links = social_links;
		this.name = name;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.id = id;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;

	}

}