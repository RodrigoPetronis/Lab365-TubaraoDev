import { useContext } from 'react';
import './styles.css';
import { UserContext } from '../../contexts/UserContext';
export function Header() {
    const { name } = useContext(UserContext);
    return (
        <div className='box'>
            <span>Sobre</span>
            <span>Blog</span>
            <span>Contato</span>
            <span>Olá {name}</span>
        </div>
    )
}