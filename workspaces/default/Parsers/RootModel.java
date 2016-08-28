import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String location_name;
	public String email;
	public String logo;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public String background_image;
	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, String name, int id, ArrayList<Social_linksModel> social_links, String type, String organizer_name, CopyrightModel copyright, String start_time, String location_name, String email, String logo, VersionModel version, String topic, String code_of_conduct, String background_image, String state, String privacy, CreatorModel creator, String timezone, String organizer_description, String description, String schedule_published_on, String end_time) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.location_name = location_name;
		this.email = email;
		this.logo = logo;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;

	}

}