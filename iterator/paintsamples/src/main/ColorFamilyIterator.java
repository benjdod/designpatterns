package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import main.PaintSample.ColorFamily;

public class ColorFamilyIterator implements Iterator<PaintSample> {
    private ColorFamily _family;
    private Iterator<PaintSample> _iter;
    private PaintSample _next;
    
    public ColorFamilyIterator(ArrayList<PaintSample> sample_list, ColorFamily color_family) {
        _family = color_family;
        _iter = sample_list.iterator();
    }

    public boolean hasNext() {
        if (_next != null) {
            return true;
        } else {
            while (_next == null) {

                if (!_iter.hasNext()) {
                    break;
                }
    
                PaintSample next_sample = _iter.next();
                if (next_sample.getColorFamily() == _family) {
                    _next = next_sample;
                    return true;
                } 
            }
        }
        return false;
    }

    public PaintSample next() {
        boolean hasnext = hasNext();
        PaintSample out;
        if (hasnext) {
            out = _next;
            _next = null;
            return out;
        } else {
            throw new NoSuchElementException("There are no more paint samples in the color family " + _family);
        }
    }
}