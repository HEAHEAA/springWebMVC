import {createContext, useEffect, useState} from "react";

export const ContextApi = createContext({});

export const ContextProvider = ({children}) => {
    const [list,setList] = useState([]);

    useEffect(()=>{
        DataOnSubmit();
    },[])
    const DataOnSubmit = async () => {
        await fetch(`api/list`,{
            method: "GET",
            headers: {
                'Content-Type': 'application/json',
            },
        }).then(res => res.json()).then(res => {
            console.log(res);
            setList(res);
        })
    }


    return(
        <ContextApi.Provider value={{
            list
        }}>
            {children}
        </ContextApi.Provider>
    )
}
