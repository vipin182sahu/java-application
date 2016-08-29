import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String logo;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String email;
	public String name;
	public String description;
	public String state;
	public String start_time;
	public String end_time;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String topic;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, int id, String logo, String code_of_conduct, String background_image, VersionModel version, String organizer_description, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String email, String name, String description, String state, String start_time, String end_time, String privacy, String timezone, String organizer_name, String topic, CopyrightModel copyright, String type) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this._creator = creator;
		this.email = email;
		this.name = name;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._copyright = copyright;
		this.type = type;

	}

}