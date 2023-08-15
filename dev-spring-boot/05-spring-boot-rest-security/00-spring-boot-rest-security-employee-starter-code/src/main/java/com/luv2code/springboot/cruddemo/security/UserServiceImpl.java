//@Service(value = "userService")
//public class UserServiceImpl implements UserDetailsService, UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//        User user = userDao.findByUsername(userId);
//        if(user == null){
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
//    }
//
//    private List getAuthority() {
//        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
//    }
//
//    public List findAll() {
//        List list = new ArrayList<>();
//        userDao.findAll().iterator().forEachRemaining(list::add);
//        return list;
//    }
//}