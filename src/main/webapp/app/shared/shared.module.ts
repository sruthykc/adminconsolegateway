import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { AdminconsolegatewaySharedLibsModule, AdminconsolegatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [AdminconsolegatewaySharedLibsModule, AdminconsolegatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [AdminconsolegatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AdminconsolegatewaySharedModule {
    static forRoot() {
        return {
            ngModule: AdminconsolegatewaySharedModule
        };
    }
}
