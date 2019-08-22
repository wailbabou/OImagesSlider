# OImagesSlider
Simple full activity as multiple images slider with zoom and indicator at the bottom for Android apps 

## Screenshots
<p float="left">
  <img src="https://github.com/wailbabou/OImagesSlider/blob/master/images/img1.png" width="150" />
  <img src="https://github.com/wailbabou/OImagesSlider/blob/master/images/img2.png" width="150" /> 
  <img src="https://github.com/wailbabou/OImagesSlider/blob/master/images/img3.png" width="150" />
</p>

## Credits

<br>
This library use :  <br>
1 . <a href="https://github.com/chrisbanes/PhotoView">PhotoView</a> <br>
2 . <a href="https://github.com/bumptech/glide">Glide</a> <br>

# Installing
Add this to your build.grade:

```
repositories {
//...
   maven { url "https://jitpack.io" }
}
```

and then in dependencies:

```
dependencies {
	 implementation 'com.github.wailbabou:OImagesSlider:v1.0.2-beta'
}
```

# How to use it
Check this  <a href="https://github.com/wailbabou/OImagesSlider/tree/master/app/src/main/java/app/slider/imageslidersample">Sample</a><br>
Or .. 
```java
        OImageSlider oImageSlider = new OImageSlider();
        oImageSlider.setColorActive(Color.WHITE) //bottom indicator active color
                .setColorInactive(Color.GRAY) // bottom indicator inactive color
                .setImageUrls(imgs) // arraylist of image urls
                .setCurrentImage(1) // the selected image ( starting from 0 )
                .setBackgroundColor(Color.BLACK) // background color of activity
                .start(this);
```

if you are using Uri change <b>setImageUrls</b> with 
```java
setImageURIs(ArrayList<Uri> imgs)
```

# LICENSE

```
MIT License

Copyright (c) 2017 wailbabou

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
