package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

//getting all the keys is O(n)

//lookup is O(1)

//inserting is O(1)

//deleting is O(1)

//searching (like never used) is O(1)

//now for array lists

//adding to the end is normally O(1) but it can be O(n) if the whole arraylist has to move in memory

//getting from a specifc element (lookup) is O(1)

//inserting to a specifc place in the list is O(n)

//removing from a specifc place is O(n)

class MyStringStringHashTable //convert to generics
  {
    private EntryList[] data;
    
    public MyStringStringHashTable(int size)
      {
        data = new EntryList[size];
        System.out.println(data[size - 1]);
      }

    private int hash(String key)
    {
      int hash = 0;
      for (int i = 0; i < key.length(); i++) //need to find a better hashing function that doesn't rely on length of the key
      {
          hash = (hash + Character.codePointAt(key, i)*i) % this.data.length;
      }
      return hash;
    }

    public void put(String key, String value) //O(1) 
    {
      int address = hash(key);
      EntryList entry = data[address];
      if (entry == null)
      {
        entry = new EntryList();
      }
      entry.add(new Entry(key, value));  
      data[address] = entry;      
    }

    public String get(String key) //O(1)
    {
      int address = hash(key);
      if (data[address] == null)
      {
        return null;
      }
      else
      {
        return data[address].get(key);
      }
    }

    //remove is also O(1)
    public void remove(String key)
    {
      int address = hash(key);
      EntryList newList = data[address];
      if (newList != null)
      {
        newList.remove(key);
        data[address] = newList;
      }
    }

    public List<String> keys() //O(1)
    {
      List<String> keys = new ArrayList<>();
      for (EntryList list: data)
      {
          if (list != null)
          {
            for (Entry entry: list.get())
            {
              keys.add(entry.getKey());    
            }
          }
      }
      return keys;
    }

    
    private class EntryList
    {
      private final List<Entry> entryList;

      EntryList()
      {
        entryList = new LinkedList<>();
      }

      void remove(String key)
      {
        for (Entry entry: entryList)
        {
          if (entry.getKey().equals(key))
            entryList.remove(entry);
            return;
        }
      }

      void add(Entry entry)
      {
        entryList.add(entry);
      }

      String get(String key)
      {
        for (Entry entry: entryList)
        {
          if (entry.getKey().equals(key))
            return entry.getValue();
        }
        return null;
      }

      List<Entry> get()
      {
        return this.entryList;
      }
    }
    
    private class Entry
    {
      private final String key;
      private final String value;
      
      Entry(String key, String value)
      {
        this.key = key;
        this.value = value;
      }

      public String getKey()
      {
        return this.key;
      }

      public String getValue()
      {
        return this.value;
      }
    }

    //search is also O(1)
  }