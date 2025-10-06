import React, { useState } from 'react';

function TextToList() {
  const [inputValue, setInputValue] = useState('');
  const [listItems, setListItems] = useState([]);

  const handleBlur = () => {
    if (inputValue.trim() !== '') {
      const items = inputValue.split(',').map(item => item.trim()).filter(item => item !== '');
      setListItems(items);
    }
  };

  return (
    <div>
      <h2>Enter items separated by commas:</h2>
      <input
        type="text"
        value={inputValue}
        onChange={e => setInputValue(e.target.value)}
        onBlur={handleBlur}
        placeholder="e.g. Apple, Banana, Cherry"
      />

      {listItems.length > 0 && (
        <ol>
          {listItems.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ol>
      )}
    </div>
  );
}

export default TextToList;
