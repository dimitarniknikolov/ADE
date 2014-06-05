        View imgLogo = findViewById(R.id.logo);
        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(imgLogo, "scaleX", 1f, 0.75f);
        scaleDownX.setDuration(750);
        scaleDownX.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDownX.setRepeatCount(ObjectAnimator.INFINITE);

        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(imgLogo, "scaleY", 0.75f, 1);
        scaleDownY.setDuration(750);
        scaleDownY.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDownY.setRepeatCount(ObjectAnimator.INFINITE);

        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.play(scaleDownX).with(scaleDownY);
        scaleDown.start();

The property animation system can animate Views on the screen by changing the actual properties in the View objects. In addition, Views also automatically call the invalidate() method to refresh the screen whenever its properties are changed. The new properties in the View class that facilitate property animations are:

    *translationX and translationY: These properties control where the View is located as a delta from its left and top coordinates which are set by its layout container.
rotation, rotationX, and rotationY: These properties control the rotation in 2D (rotation property) and 3D around the pivot point.
    *scaleX and scaleY: These properties control the 2D scaling of a View around its pivot point.
pivotX and pivotY: These properties control the location of the pivot point, around which the rotation and scaling transforms occur. By default, the pivot point is located at the center of the object.
    *x and y: These are simple utility properties to describe the final location of the View in its container, as a sum of the left and top values and translationX and translationY values.
    *alpha: Represents the alpha transparency on the View. This value is 1 (opaque) by default, with a value of 0 representing full transparency (not visible).