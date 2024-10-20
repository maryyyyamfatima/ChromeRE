package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FG3 implements GG3 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ TemplateUrlService g;

    public FG3(TemplateUrlService templateUrlService, Runnable runnable) {
        this.g = templateUrlService;
        this.a = runnable;
    }

    @Override // defpackage.GG3
    public final void d() {
        TemplateUrlService templateUrlService = this.g;
        templateUrlService.getClass();
        Object obj = ThreadUtils.a;
        templateUrlService.a.d(this);
        this.a.run();
    }
}
