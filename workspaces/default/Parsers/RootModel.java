import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String email;
	public String background_image;
	public String timezone;
	public String privacy;
	public VersionModel _version;
	public String logo;
	public int id;
	public String name;
	public String organizer_name;
	public String schedule_published_on;
	public String code_of_conduct;
	public String start_time;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, String topic, String location_name, CreatorModel creator, CopyrightModel copyright, String organizer_description, String end_time, String type, ArrayList<Social_linksModel> social_links, String state, String email, String background_image, String timezone, String privacy, VersionModel version, String logo, int id, String name, String organizer_name, String schedule_published_on, String code_of_conduct, String start_time, String description) {

		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this.state = state;
		this.email = email;
		this.background_image = background_image;
		this.timezone = timezone;
		this.privacy = privacy;
		this._version = version;
		this.logo = logo;
		this.id = id;
		this.name = name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.description = description;

	}

}