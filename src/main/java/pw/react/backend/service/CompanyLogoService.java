package pw.react.backend.service;

import org.springframework.web.multipart.MultipartFile;
import pw.react.backend.model.CompanyLogo;

/** Created by Pawel Gawedzki on 06-Oct-2019. */
public interface CompanyLogoService {
    CompanyLogo storeLogo(long companyId, MultipartFile file);
    CompanyLogo getCompanyLogo(long companyId);
    void deleteCompanyLogo(long companyId);
}
