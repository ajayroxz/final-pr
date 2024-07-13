// Fetch user information (replace with actual logic to fetch from Flask)
const user = { username: "student123", role: "student" };

// Function to dynamically populate navigation based on user role
function updateNavigation() {
  const navigation = document.getElementById("navigation");
  navigation.innerHTML = ""; // Clear existing content

  if (user.role === "admin") {
    // Navigation for admin role (e.g., manage schedules, create announcements)
    const adminLinks = [
      { text: "Manage Schedules", href: "/admin/schedules" },
      { text: "Create Announcements", href: "/admin/announcements" },
    ];
    addNavigationLinks(adminLinks);
  } else if (user.role === "faculty") {
    // Navigation for faculty role (e.g., view schedule, create announcements)
    const facultyLinks = [
      { text: "View Schedule", href: "/faculty/schedule" },
      { text: "Create Announcements", href: "/faculty/announcements" },
    ];
    addNavigationLinks(facultyLinks);
  } else if (user.role === "student") {
    // Navigation for student role (e.g., view schedule)
    const studentLinks = [{ text: "View Schedule", href: "/student/schedule" }];
    addNavigationLinks(studentLinks);
  } else {
    // Handle unknown role (e.g., display error message)
    console.error("Unknown user role");
  }
}

function addNavigationLinks(links) {
  const navigationList = document.createElement("ul");
  links.forEach(link => {
    const listItem = document.createElement("li");
    const linkElement = document.createElement("a");
    linkElement.href = link.href;
    linkElement.textContent = link.text;
    listItem.appendChild(linkElement);
    navigationList.appendChild(listItem);
  });
  const navigation = document.getElementById("navigation");
  navigation.appendChild(navigationList);
}

updateNavigation();  // Call function on page load
