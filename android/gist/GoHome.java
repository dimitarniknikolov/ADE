Intent exitIntent = new Intent(Intent.ACTION_MAIN);
exitIntent.addCategory(Intent.CATEGORY_HOME);
exitIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
startActivity(exitIntent);
