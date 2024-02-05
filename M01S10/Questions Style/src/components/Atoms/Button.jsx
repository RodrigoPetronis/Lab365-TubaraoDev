import * as React from 'react';
import Button from '@mui/material/Button';

export default function ButtonUsage({variant,texto}) {
  return <styled.Button className="cssButton" variant={variant}>{texto}</styled.Button>;
}