//import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { BrowserRouter } from "react-router";
import './styles/index.css';
import Home from './routes/home';

createRoot(document.getElementById('root')).render(
  <BrowserRouter>
    <Home />
  </BrowserRouter>,
)
