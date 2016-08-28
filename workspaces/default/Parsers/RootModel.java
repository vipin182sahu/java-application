import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String logo;
	public String end_time;
	public String description;
	public String background_image;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public int id;
	public String email;
	public String topic;
	public String state;
	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public String location_name;

	public RootModel(Call_for_papersModel call_for_papers, CreatorModel creator, String logo, String end_time, String description, String background_image, VersionModel version, String start_time, String organizer_description, int id, String email, String topic, String state, CopyrightModel copyright, String timezone, String type, String privacy, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, String organizer_name, String schedule_published_on, String location_name) {

		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.logo = logo;
		this.end_time = end_time;
		this.description = description;
		this.background_image = background_image;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.topic = topic;
		this.state = state;
		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.privacy = privacy;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;

	}

}