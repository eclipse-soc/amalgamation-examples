/**
 * Generated with Acceleo
 */
package droid.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import droid.parts.DroidViewsRepository;
import droid.parts.forms.AbstractActivityPropertiesEditionPartForm;
import droid.parts.forms.AbstractLinearLayoutPropertiesEditionPartForm;
import droid.parts.forms.AbstractResourceAccessPropertiesEditionPartForm;
import droid.parts.forms.AbstractViewPropertiesEditionPartForm;
import droid.parts.forms.ActionSetPropertiesEditionPartForm;
import droid.parts.forms.ActivityPropertiesEditionPartForm;
import droid.parts.forms.AlphaAnimationPropertiesEditionPartForm;
import droid.parts.forms.AnimationFramePropertiesEditionPartForm;
import droid.parts.forms.AnimationRAPropertiesEditionPartForm;
import droid.parts.forms.AnimationResourcePropertiesEditionPartForm;
import droid.parts.forms.AnimationVAPropertiesEditionPartForm;
import droid.parts.forms.ApplicationPropertiesEditionPartForm;
import droid.parts.forms.ApplicationUsesSDKPropertiesEditionPartForm;
import droid.parts.forms.ArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.BitmapDrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.BooleanRAPropertiesEditionPartForm;
import droid.parts.forms.BooleanResourcePropertiesEditionPartForm;
import droid.parts.forms.BooleanVAPropertiesEditionPartForm;
import droid.parts.forms.BooleanVDPropertiesEditionPartForm;
import droid.parts.forms.ButtonPropertiesEditionPartForm;
import droid.parts.forms.CheckBoxPropertiesEditionPartForm;
import droid.parts.forms.ColorRAPropertiesEditionPartForm;
import droid.parts.forms.ColorResourcePropertiesEditionPartForm;
import droid.parts.forms.ColorVAPropertiesEditionPartForm;
import droid.parts.forms.ColorVDPropertiesEditionPartForm;
import droid.parts.forms.DimensionRAPropertiesEditionPartForm;
import droid.parts.forms.DimensionResourcePropertiesEditionPartForm;
import droid.parts.forms.DimensionVAPropertiesEditionPartForm;
import droid.parts.forms.DimensionVDPropertiesEditionPartForm;
import droid.parts.forms.DrawableRAPropertiesEditionPartForm;
import droid.parts.forms.DrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.DrawableVAPropertiesEditionPartForm;
import droid.parts.forms.EditTextPropertiesEditionPartForm;
import droid.parts.forms.FrameAnimationResourcePropertiesEditionPartForm;
import droid.parts.forms.FrameLayoutPropertiesEditionPartForm;
import droid.parts.forms.GenericActivityPropertiesEditionPartForm;
import droid.parts.forms.GoToURLActionPropertiesEditionPartForm;
import droid.parts.forms.ImageViewPropertiesEditionPartForm;
import droid.parts.forms.IntegerArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.IntegerRAPropertiesEditionPartForm;
import droid.parts.forms.IntegerResourcePropertiesEditionPartForm;
import droid.parts.forms.IntegerVAPropertiesEditionPartForm;
import droid.parts.forms.IntegerVDPropertiesEditionPartForm;
import droid.parts.forms.InterpolatorRAPropertiesEditionPartForm;
import droid.parts.forms.InterpolatorVAPropertiesEditionPartForm;
import droid.parts.forms.InvokeActivityActionPropertiesEditionPartForm;
import droid.parts.forms.LayoutDimensionVAPropertiesEditionPartForm;
import droid.parts.forms.LayoutParamsPropertiesEditionPartForm;
import droid.parts.forms.LayoutPropertiesEditionPartForm;
import droid.parts.forms.LinearLayoutPropertiesEditionPartForm;
import droid.parts.forms.ListActivityPropertiesEditionPartForm;
import droid.parts.forms.MenuGroupPropertiesEditionPartForm;
import droid.parts.forms.MenuItemPropertiesEditionPartForm;
import droid.parts.forms.MenuResourcePropertiesEditionPartForm;
import droid.parts.forms.RadioButtonPropertiesEditionPartForm;
import droid.parts.forms.RadioGroupPropertiesEditionPartForm;
import droid.parts.forms.RelativeLayoutPropertiesEditionPartForm;
import droid.parts.forms.ResourceAccessPropertiesEditionPartForm;
import droid.parts.forms.ResourcePropertiesEditionPartForm;
import droid.parts.forms.RotateAnimationPropertiesEditionPartForm;
import droid.parts.forms.ScaleAnimationPropertiesEditionPartForm;
import droid.parts.forms.ShowLayoutActionPropertiesEditionPartForm;
import droid.parts.forms.SpinnerPropertiesEditionPartForm;
import droid.parts.forms.StringArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.StringRAPropertiesEditionPartForm;
import droid.parts.forms.StringResourcePropertiesEditionPartForm;
import droid.parts.forms.StringVAPropertiesEditionPartForm;
import droid.parts.forms.StringVDPropertiesEditionPartForm;
import droid.parts.forms.SubMenuPropertiesEditionPartForm;
import droid.parts.forms.TabActivityPropertiesEditionPartForm;
import droid.parts.forms.TabHostPropertiesEditionPartForm;
import droid.parts.forms.TabPropertiesEditionPartForm;
import droid.parts.forms.TabWidgetPropertiesEditionPartForm;
import droid.parts.forms.TerminalAnimationElementsPropertiesEditionPartForm;
import droid.parts.forms.TerminalAnimationSetPropertiesEditionPartForm;
import droid.parts.forms.TextViewPropertiesEditionPartForm;
import droid.parts.forms.TransitionDrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.TranslateAnimationPropertiesEditionPartForm;
import droid.parts.forms.TweenAnimationResourcePropertiesEditionPartForm;
import droid.parts.forms.TypedArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.ValueResourcePropertiesEditionPartForm;
import droid.parts.forms.ViewCollectionPropertiesEditionPartForm;
import droid.parts.forms.ViewPropertiesEditionPartForm;
import droid.parts.forms.WidgetPropertiesEditionPartForm;
import droid.parts.impl.AbstractActivityPropertiesEditionPartImpl;
import droid.parts.impl.AbstractLinearLayoutPropertiesEditionPartImpl;
import droid.parts.impl.AbstractResourceAccessPropertiesEditionPartImpl;
import droid.parts.impl.AbstractViewPropertiesEditionPartImpl;
import droid.parts.impl.ActionSetPropertiesEditionPartImpl;
import droid.parts.impl.ActivityPropertiesEditionPartImpl;
import droid.parts.impl.AlphaAnimationPropertiesEditionPartImpl;
import droid.parts.impl.AnimationFramePropertiesEditionPartImpl;
import droid.parts.impl.AnimationRAPropertiesEditionPartImpl;
import droid.parts.impl.AnimationResourcePropertiesEditionPartImpl;
import droid.parts.impl.AnimationVAPropertiesEditionPartImpl;
import droid.parts.impl.ApplicationPropertiesEditionPartImpl;
import droid.parts.impl.ApplicationUsesSDKPropertiesEditionPartImpl;
import droid.parts.impl.ArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.BitmapDrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.BooleanRAPropertiesEditionPartImpl;
import droid.parts.impl.BooleanResourcePropertiesEditionPartImpl;
import droid.parts.impl.BooleanVAPropertiesEditionPartImpl;
import droid.parts.impl.BooleanVDPropertiesEditionPartImpl;
import droid.parts.impl.ButtonPropertiesEditionPartImpl;
import droid.parts.impl.CheckBoxPropertiesEditionPartImpl;
import droid.parts.impl.ColorRAPropertiesEditionPartImpl;
import droid.parts.impl.ColorResourcePropertiesEditionPartImpl;
import droid.parts.impl.ColorVAPropertiesEditionPartImpl;
import droid.parts.impl.ColorVDPropertiesEditionPartImpl;
import droid.parts.impl.DimensionRAPropertiesEditionPartImpl;
import droid.parts.impl.DimensionResourcePropertiesEditionPartImpl;
import droid.parts.impl.DimensionVAPropertiesEditionPartImpl;
import droid.parts.impl.DimensionVDPropertiesEditionPartImpl;
import droid.parts.impl.DrawableRAPropertiesEditionPartImpl;
import droid.parts.impl.DrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.DrawableVAPropertiesEditionPartImpl;
import droid.parts.impl.EditTextPropertiesEditionPartImpl;
import droid.parts.impl.FrameAnimationResourcePropertiesEditionPartImpl;
import droid.parts.impl.FrameLayoutPropertiesEditionPartImpl;
import droid.parts.impl.GenericActivityPropertiesEditionPartImpl;
import droid.parts.impl.GoToURLActionPropertiesEditionPartImpl;
import droid.parts.impl.ImageViewPropertiesEditionPartImpl;
import droid.parts.impl.IntegerArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.IntegerRAPropertiesEditionPartImpl;
import droid.parts.impl.IntegerResourcePropertiesEditionPartImpl;
import droid.parts.impl.IntegerVAPropertiesEditionPartImpl;
import droid.parts.impl.IntegerVDPropertiesEditionPartImpl;
import droid.parts.impl.InterpolatorRAPropertiesEditionPartImpl;
import droid.parts.impl.InterpolatorVAPropertiesEditionPartImpl;
import droid.parts.impl.InvokeActivityActionPropertiesEditionPartImpl;
import droid.parts.impl.LayoutDimensionVAPropertiesEditionPartImpl;
import droid.parts.impl.LayoutParamsPropertiesEditionPartImpl;
import droid.parts.impl.LayoutPropertiesEditionPartImpl;
import droid.parts.impl.LinearLayoutPropertiesEditionPartImpl;
import droid.parts.impl.ListActivityPropertiesEditionPartImpl;
import droid.parts.impl.MenuGroupPropertiesEditionPartImpl;
import droid.parts.impl.MenuItemPropertiesEditionPartImpl;
import droid.parts.impl.MenuResourcePropertiesEditionPartImpl;
import droid.parts.impl.RadioButtonPropertiesEditionPartImpl;
import droid.parts.impl.RadioGroupPropertiesEditionPartImpl;
import droid.parts.impl.RelativeLayoutPropertiesEditionPartImpl;
import droid.parts.impl.ResourceAccessPropertiesEditionPartImpl;
import droid.parts.impl.ResourcePropertiesEditionPartImpl;
import droid.parts.impl.RotateAnimationPropertiesEditionPartImpl;
import droid.parts.impl.ScaleAnimationPropertiesEditionPartImpl;
import droid.parts.impl.ShowLayoutActionPropertiesEditionPartImpl;
import droid.parts.impl.SpinnerPropertiesEditionPartImpl;
import droid.parts.impl.StringArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.StringRAPropertiesEditionPartImpl;
import droid.parts.impl.StringResourcePropertiesEditionPartImpl;
import droid.parts.impl.StringVAPropertiesEditionPartImpl;
import droid.parts.impl.StringVDPropertiesEditionPartImpl;
import droid.parts.impl.SubMenuPropertiesEditionPartImpl;
import droid.parts.impl.TabActivityPropertiesEditionPartImpl;
import droid.parts.impl.TabHostPropertiesEditionPartImpl;
import droid.parts.impl.TabPropertiesEditionPartImpl;
import droid.parts.impl.TabWidgetPropertiesEditionPartImpl;
import droid.parts.impl.TerminalAnimationElementsPropertiesEditionPartImpl;
import droid.parts.impl.TerminalAnimationSetPropertiesEditionPartImpl;
import droid.parts.impl.TextViewPropertiesEditionPartImpl;
import droid.parts.impl.TransitionDrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.TranslateAnimationPropertiesEditionPartImpl;
import droid.parts.impl.TweenAnimationResourcePropertiesEditionPartImpl;
import droid.parts.impl.TypedArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.ValueResourcePropertiesEditionPartImpl;
import droid.parts.impl.ViewCollectionPropertiesEditionPartImpl;
import droid.parts.impl.ViewPropertiesEditionPartImpl;
import droid.parts.impl.WidgetPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class DroidPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == DroidViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == DroidViewsRepository.Application.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ApplicationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ApplicationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ApplicationUsesSDK.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ApplicationUsesSDKPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ApplicationUsesSDKPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Resource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Layout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AbstractActivity.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AbstractActivityPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AbstractActivityPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Activity.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ActivityPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ActivityPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.GenericActivity.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new GenericActivityPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new GenericActivityPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ViewCollection.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ViewCollectionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ViewCollectionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ListActivity.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ListActivityPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ListActivityPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TabActivity.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TabActivityPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TabActivityPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Tab.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TabPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TabPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ActionSet.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ActionSetPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ActionSetPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.GoToURLAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new GoToURLActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new GoToURLActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ShowLayoutAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ShowLayoutActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ShowLayoutActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.InvokeActivityAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new InvokeActivityActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new InvokeActivityActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AbstractLinearLayout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AbstractLinearLayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AbstractLinearLayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AbstractView.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AbstractViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AbstractViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.View.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.LinearLayout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LinearLayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LinearLayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.RelativeLayout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new RelativeLayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new RelativeLayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TabHost.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TabHostPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TabHostPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TabWidget.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TabWidgetPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TabWidgetPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.FrameLayout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new FrameLayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new FrameLayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.LayoutParams.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutParamsPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutParamsPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Widget.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new WidgetPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new WidgetPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TextView.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TextViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TextViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ImageView.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ImageViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ImageViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Button.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ButtonPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ButtonPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Spinner.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new SpinnerPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new SpinnerPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.EditText.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new EditTextPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new EditTextPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.LayoutDimensionVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutDimensionVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutDimensionVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DrawableVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DrawableVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DrawableVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AnimationVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AnimationVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AnimationVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.InterpolatorVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new InterpolatorVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new InterpolatorVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringVD.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringVDPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringVDPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerVD.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerVDPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerVDPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanVD.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanVDPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanVDPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorVD.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorVDPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorVDPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionVD.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionVDPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionVDPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ValueResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ValueResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ValueResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TypedArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TypedArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TypedArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BitmapDrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BitmapDrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BitmapDrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TransitionDrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TransitionDrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TransitionDrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.MenuResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new MenuResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new MenuResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.MenuItem.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new MenuItemPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new MenuItemPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.SubMenu.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new SubMenuPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new SubMenuPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AnimationResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AnimationResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AnimationResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TerminalAnimationElements.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TerminalAnimationElementsPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TerminalAnimationElementsPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TerminalAnimationSet.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TerminalAnimationSetPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TerminalAnimationSetPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AlphaAnimation.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AlphaAnimationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AlphaAnimationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ScaleAnimation.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ScaleAnimationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ScaleAnimationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TranslateAnimation.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TranslateAnimationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TranslateAnimationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.RotateAnimation.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new RotateAnimationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new RotateAnimationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TweenAnimationResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TweenAnimationResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TweenAnimationResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.FrameAnimationResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new FrameAnimationResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new FrameAnimationResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AnimationFrame.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AnimationFramePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AnimationFramePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AbstractResourceAccess.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AbstractResourceAccessPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AbstractResourceAccessPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ResourceAccess.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ResourceAccessPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ResourceAccessPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DrawableRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DrawableRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DrawableRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.AnimationRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new AnimationRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new AnimationRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.InterpolatorRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new InterpolatorRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new InterpolatorRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.CheckBox.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new CheckBoxPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new CheckBoxPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.RadioButton.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new RadioButtonPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new RadioButtonPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.RadioGroup.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new RadioGroupPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new RadioGroupPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.MenuGroup.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new MenuGroupPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new MenuGroupPropertiesEditionPartForm(component);
		}
		return null;
	}

}
