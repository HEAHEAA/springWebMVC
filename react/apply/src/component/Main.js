import {useContext} from "react";
import {ContextApi} from "../context/ContextApi";
import {Table, TableBody, TableCell, TableHead, TableRow} from "@mui/material";

function Main(){
    const {list} = useContext(ContextApi);
    console.log(list);

    return(
        <div>
            <Table>
                <TableHead>
                    <TableRow>
                        <TableCell>번호</TableCell>
                        <TableCell>이름</TableCell>
                        <TableCell>나이</TableCell>
                        <TableCell>시간</TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {
                        [...list]
                            .reverse()
                            .map(function (arr,inx){
                            return(
                                <TableRow>
                                    <TableCell>{arr.id}</TableCell>
                                    <TableCell>{arr.name}</TableCell>
                                    <TableCell>{arr.age}</TableCell>
                                    <TableCell>{arr.time}</TableCell>
                                </TableRow>
                            )
                        })
                    }

                </TableBody>
            </Table>
        </div>
    )
}
export default Main;