import './App.css';
import {Route, Routes} from "react-router-dom";
import Main from "./component/Main";
import {ContextProvider} from "./context/ContextApi";

function App() {
  return (
    <div className="App">
        <ContextProvider>
            <Routes>
                <Route path="/" element={<Main/>}/>
            </Routes>
        </ContextProvider>
    </div>
  );
}

export default App;
