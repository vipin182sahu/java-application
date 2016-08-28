import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String code_of_conduct;
	public String name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String state;
	public String location_name;
	public String logo;
	public String type;
	public String description;
	public VersionModel _version;
	public String timezone;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String schedule_published_on;
	public String organizer_name;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, int id, String privacy, String code_of_conduct, String name, String background_image, ArrayList<Social_linksModel> social_links, String email, String state, String location_name, String logo, String type, String description, VersionModel version, String timezone, CopyrightModel copyright, String start_time, CreatorModel creator, String organizer_description, String topic, String schedule_published_on, String organizer_name, String end_time) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.background_image = background_image;
		this.social_links = social_links;
		this.email = email;
		this.state = state;
		this.location_name = location_name;
		this.logo = logo;
		this.type = type;
		this.description = description;
		this._version = version;
		this.timezone = timezone;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.end_time = end_time;

	}

}