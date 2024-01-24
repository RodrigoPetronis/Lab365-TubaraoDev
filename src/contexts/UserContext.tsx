import { createContext, useEffect, useState } from "react";

interface UserContextType {
    isLogged: boolean;
    name: string;
    handleLogin: () => void;
    handleLogout: () => void;
}

export const UserContext = createContext({} as UserContextType);

export function UserProvider({ children }: { children: React.ReactNode }) {
    const [isLogged, setIsLogged] = useState(false);
    const [name, setName] = useState("");

    useEffect(() => {
        isLogged ? setName('Manuel') : setName('Visitante');
    }, [isLogged]);

    function handleLogin() {
        setIsLogged(true);
    }
    function handleLogout() {
        setIsLogged(false);
    }

    return (
        <UserContext.Provider value={{ isLogged, name, handleLogin, handleLogout }}>
            {children}
        </UserContext.Provider>
    );
}
