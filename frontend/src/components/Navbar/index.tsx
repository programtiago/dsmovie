import {ReactComponent as GithubIcon} from 'assets/img/icons8-github.svg';

function NavBar(){
    return(
        <header>
        <nav>
          <div>
            <h1>DSMovie</h1>
            <a href="https://github.com/programtiago">
              <div>
                <GithubIcon />
                <p>/programtiago</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    )
}

export default NavBar;