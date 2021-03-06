package trikita.anvil.v15;

import android.app.FragmentBreadCrumbs;
import android.appwidget.AppWidgetHostView;
import android.gesture.GestureOverlayView;
import android.inputmethodservice.ExtractEditText;
import android.inputmethodservice.KeyboardView;
import android.opengl.GLSurfaceView;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsSpinner;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.MultiAutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;
import trikita.anvil.Nodes;

/**
 * Helper methods to simplify view declaration in the layouts
 * This file was generated by {@code gradle generateAttrs}
 */
public class Views {
  public static Nodes.ViewNode horizontalScrollView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(HorizontalScrollView.class, args);
  }

  public static Nodes.ViewNode tableRow(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TableRow.class, args);
  }

  public static Nodes.ViewNode viewSwitcher(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ViewSwitcher.class, args);
  }

  public static Nodes.ViewNode space(Nodes.AttrNode... args) {
    return Nodes.v(Space.class, args);
  }

  public static Nodes.ViewNode adapterViewFlipper(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AdapterViewFlipper.class, args);
  }

  public static Nodes.ViewNode checkBox(Nodes.AttrNode... args) {
    return Nodes.v(CheckBox.class, args);
  }

  public static Nodes.ViewNode textView(Nodes.AttrNode... args) {
    return Nodes.v(TextView.class, args);
  }

  public static Nodes.ViewNode zoomButton(Nodes.AttrNode... args) {
    return Nodes.v(ZoomButton.class, args);
  }

  public static Nodes.ViewNode digitalClock(Nodes.AttrNode... args) {
    return Nodes.v(DigitalClock.class, args);
  }

  public static Nodes.ViewNode chronometer(Nodes.AttrNode... args) {
    return Nodes.v(Chronometer.class, args);
  }

  public static Nodes.ViewNode multiAutoCompleteTextView(Nodes.AttrNode... args) {
    return Nodes.v(MultiAutoCompleteTextView.class, args);
  }

  public static Nodes.ViewNode radioButton(Nodes.AttrNode... args) {
    return Nodes.v(RadioButton.class, args);
  }

  public static Nodes.ViewNode imageSwitcher(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ImageSwitcher.class, args);
  }

  public static Nodes.ViewNode editText(Nodes.AttrNode... args) {
    return Nodes.v(EditText.class, args);
  }

  public static Nodes.ViewNode dialerFilter(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(DialerFilter.class, args);
  }

  public static Nodes.ViewNode timePicker(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TimePicker.class, args);
  }

  public static Nodes.ViewNode button(Nodes.AttrNode... args) {
    return Nodes.v(Button.class, args);
  }

  public static Nodes.ViewNode searchView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(SearchView.class, args);
  }

  public static Nodes.ViewNode switchView(Nodes.AttrNode... args) {
    return Nodes.v(Switch.class, args);
  }

  public static Nodes.ViewNode gridLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(GridLayout.class, args);
  }

  public static Nodes.ViewNode listView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ListView.class, args);
  }

  public static Nodes.ViewNode gallery(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(Gallery.class, args);
  }

  public static Nodes.ViewNode progressBar(Nodes.AttrNode... args) {
    return Nodes.v(ProgressBar.class, args);
  }

  public static Nodes.ViewNode slidingDrawer(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(SlidingDrawer.class, args);
  }

  public static Nodes.ViewNode radioGroup(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(RadioGroup.class, args);
  }

  public static Nodes.ViewNode tableLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TableLayout.class, args);
  }

  public static Nodes.ViewNode textSwitcher(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TextSwitcher.class, args);
  }

  public static Nodes.ViewNode imageButton(Nodes.AttrNode... args) {
    return Nodes.v(ImageButton.class, args);
  }

  public static Nodes.ViewNode zoomControls(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ZoomControls.class, args);
  }

  public static Nodes.ViewNode absSpinner(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AbsSpinner.class, args);
  }

  public static Nodes.ViewNode twoLineListItem(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TwoLineListItem.class, args);
  }

  public static Nodes.ViewNode autoCompleteTextView(Nodes.AttrNode... args) {
    return Nodes.v(AutoCompleteTextView.class, args);
  }

  public static Nodes.ViewNode spinner(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(Spinner.class, args);
  }

  public static Nodes.ViewNode seekBar(Nodes.AttrNode... args) {
    return Nodes.v(SeekBar.class, args);
  }

  public static Nodes.ViewNode numberPicker(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(NumberPicker.class, args);
  }

  public static Nodes.ViewNode ratingBar(Nodes.AttrNode... args) {
    return Nodes.v(RatingBar.class, args);
  }

  public static Nodes.ViewNode adapterViewAnimator(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AdapterViewAnimator.class, args);
  }

  public static Nodes.ViewNode viewFlipper(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ViewFlipper.class, args);
  }

  public static Nodes.ViewNode quickContactBadge(Nodes.AttrNode... args) {
    return Nodes.v(QuickContactBadge.class, args);
  }

  public static Nodes.ViewNode relativeLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(RelativeLayout.class, args);
  }

  public static Nodes.ViewNode analogClock(Nodes.AttrNode... args) {
    return Nodes.v(AnalogClock.class, args);
  }

  public static Nodes.ViewNode calendarView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(CalendarView.class, args);
  }

  public static Nodes.ViewNode tabWidget(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TabWidget.class, args);
  }

  public static Nodes.ViewNode absoluteLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AbsoluteLayout.class, args);
  }

  public static Nodes.ViewNode viewAnimator(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ViewAnimator.class, args);
  }

  public static Nodes.ViewNode expandableListView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ExpandableListView.class, args);
  }

  public static Nodes.ViewNode mediaController(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(MediaController.class, args);
  }

  public static Nodes.ViewNode gridView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(GridView.class, args);
  }

  public static Nodes.ViewNode frameLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(FrameLayout.class, args);
  }

  public static Nodes.ViewNode absListView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AbsListView.class, args);
  }

  public static Nodes.ViewNode stackView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(StackView.class, args);
  }

  public static Nodes.ViewNode checkedTextView(Nodes.AttrNode... args) {
    return Nodes.v(CheckedTextView.class, args);
  }

  public static Nodes.ViewNode videoView(Nodes.AttrNode... args) {
    return Nodes.v(VideoView.class, args);
  }

  public static Nodes.ViewNode tabHost(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(TabHost.class, args);
  }

  public static Nodes.ViewNode scrollView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ScrollView.class, args);
  }

  public static Nodes.ViewNode linearLayout(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(LinearLayout.class, args);
  }

  public static Nodes.ViewNode adapterView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AdapterView.class, args);
  }

  public static Nodes.ViewNode toggleButton(Nodes.AttrNode... args) {
    return Nodes.v(ToggleButton.class, args);
  }

  public static Nodes.ViewNode compoundButton(Nodes.AttrNode... args) {
    return Nodes.v(CompoundButton.class, args);
  }

  public static Nodes.ViewNode absSeekBar(Nodes.AttrNode... args) {
    return Nodes.v(AbsSeekBar.class, args);
  }

  public static Nodes.ViewNode imageView(Nodes.AttrNode... args) {
    return Nodes.v(ImageView.class, args);
  }

  public static Nodes.ViewNode datePicker(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(DatePicker.class, args);
  }

  public static Nodes.ViewNode surfaceView(Nodes.AttrNode... args) {
    return Nodes.v(SurfaceView.class, args);
  }

  public static Nodes.ViewNode viewStub(Nodes.AttrNode... args) {
    return Nodes.v(ViewStub.class, args);
  }

  public static Nodes.ViewNode view(Nodes.AttrNode... args) {
    return Nodes.v(View.class, args);
  }

  public static Nodes.ViewNode viewGroup(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(ViewGroup.class, args);
  }

  public static Nodes.ViewNode textureView(Nodes.AttrNode... args) {
    return Nodes.v(TextureView.class, args);
  }

  public static Nodes.ViewNode gestureOverlayView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(GestureOverlayView.class, args);
  }

  public static Nodes.ViewNode gLSurfaceView(Nodes.AttrNode... args) {
    return Nodes.v(GLSurfaceView.class, args);
  }

  public static Nodes.ViewNode appWidgetHostView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(AppWidgetHostView.class, args);
  }

  public static Nodes.ViewNode webView(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(WebView.class, args);
  }

  public static Nodes.ViewNode extractEditText(Nodes.AttrNode... args) {
    return Nodes.v(ExtractEditText.class, args);
  }

  public static Nodes.ViewNode keyboardView(Nodes.AttrNode... args) {
    return Nodes.v(KeyboardView.class, args);
  }

  public static Nodes.ViewNode fragmentBreadCrumbs(Nodes.INode<? super ViewGroup>... args) {
    return Nodes.v(FragmentBreadCrumbs.class, args);
  }
}
