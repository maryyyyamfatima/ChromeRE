package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.rename.RenameDialogCustomView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fN2 */
/* loaded from: classes.dex */
public final class C5226fN2 {
    public final VM2 a;
    public final C5914hN2 b;
    public String c;
    public String d;
    public InterfaceC4882eN2 f;
    public int e = 5;
    public int g = 0;

    public C5226fN2(Context context, ZX1 zx1) {
        this.a = new VM2(context, zx1, new Callback() { // from class: ZM2
            public /* synthetic */ ZM2() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C5226fN2 c5226fN2 = C5226fN2.this;
                VM2 vm2 = c5226fN2.a;
                if (!booleanValue) {
                    ZX1 zx12 = vm2.a;
                    if (zx12 != null) {
                        zx12.c(2, vm2.b);
                        return;
                    }
                    return;
                }
                String obj2 = vm2.c.g.getText().toString();
                c5226fN2.d = obj2;
                if (TextUtils.equals(obj2, c5226fN2.c)) {
                    c5226fN2.a(2, 1);
                } else {
                    if (N.MatdI239(c5226fN2.d).equalsIgnoreCase(N.MatdI239(c5226fN2.c))) {
                        c5226fN2.f.a(new C4539dN2(c5226fN2), c5226fN2.d);
                        return;
                    }
                    c5226fN2.a(4, 1);
                }
            }
        }, new Callback() { // from class: aN2
            public /* synthetic */ C3508aN2() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C5226fN2.this.getClass();
                int i = 1;
                if (intValue == 1) {
                    i = 0;
                } else if (intValue != 2) {
                    i = 2;
                }
                EI2.h(i, 6, "Android.Download.Rename.Dialog.Action");
            }
        });
        this.b = new C5914hN2(context, zx1, new Callback() { // from class: bN2
            public /* synthetic */ C3852bN2() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C5226fN2 c5226fN2 = C5226fN2.this;
                if (booleanValue) {
                    c5226fN2.f.a(new C4539dN2(c5226fN2), c5226fN2.d);
                    return;
                }
                c5226fN2.a(5, 2);
            }
        }, new Callback() { // from class: cN2
            public /* synthetic */ C4195cN2() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C5226fN2 c5226fN2 = C5226fN2.this;
                int i = 5;
                if (intValue == 5) {
                    c5226fN2.a(5, intValue);
                }
                c5226fN2.getClass();
                if (intValue == 1) {
                    i = 3;
                } else if (intValue == 2) {
                    i = 4;
                }
                EI2.h(i, 6, "Android.Download.Rename.Dialog.Action");
            }
        });
    }

    public final void a(int i, int i2) {
        ZX1 zx1;
        C5914hN2 c5914hN2 = this.b;
        VM2 vm2 = this.a;
        switch (i) {
            case 0:
                int i3 = this.g;
                if (i3 != 4 && i3 != 6) {
                    if ((i3 == 1 || i3 == 3) && (zx1 = vm2.a) != null) {
                        zx1.c(i2, vm2.b);
                        break;
                    }
                } else {
                    ZX1 zx12 = c5914hN2.a;
                    if (zx12 != null) {
                        zx12.c(i2, c5914hN2.b);
                        break;
                    }
                }
                break;
            case 1:
                String str = this.c;
                vm2.a.l(vm2.b, 1, true);
                RenameDialogCustomView renameDialogCustomView = vm2.c;
                renameDialogCustomView.a(str);
                renameDialogCustomView.b(false);
                renameDialogCustomView.a.setTextColor(renameDialogCustomView.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f07013d));
                renameDialogCustomView.a.setVisibility(8);
                break;
            case 2:
                ZX1 zx13 = vm2.a;
                if (zx13 != null) {
                    zx13.c(i2, vm2.b);
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                vm2.a(this.e, this.d);
                break;
            case 4:
                c5914hN2.a.l(c5914hN2.b, 1, true);
                ZX1 zx14 = vm2.a;
                if (zx14 != null) {
                    zx14.c(i2, vm2.b);
                    break;
                }
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                ZX1 zx15 = c5914hN2.a;
                if (zx15 != null) {
                    zx15.c(i2, c5914hN2.b);
                }
                String str2 = this.d;
                vm2.a.l(vm2.b, 1, true);
                RenameDialogCustomView renameDialogCustomView2 = vm2.c;
                renameDialogCustomView2.a(str2);
                renameDialogCustomView2.b(false);
                renameDialogCustomView2.a.setTextColor(renameDialogCustomView2.getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f07013d));
                renameDialogCustomView2.a.setVisibility(8);
                break;
            case 6:
                ZX1 zx16 = c5914hN2.a;
                if (zx16 != null) {
                    zx16.c(i2, c5914hN2.b);
                }
                vm2.a(this.e, this.d);
                break;
        }
        this.g = i;
    }
}
