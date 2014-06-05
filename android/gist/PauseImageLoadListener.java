public class PauseImageLoadListener implements AbsListView.OnScrollListener {

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (scrollState == AbsListView.OnScrollListener.SCROLL_STATE_FLING) {
            AppImageLoader.pause();
        } else {
            AppImageLoader.resume();
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
            int totalItemCount) {
        // Nothing to do
    }
}

// usage
listView.setOnScrollListener(new PauseImageLoadListener());