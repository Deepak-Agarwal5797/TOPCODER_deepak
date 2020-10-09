#include<vector>
using namespace std;

class ANDEquation{
public:
	int restoreY(vector<int> A);
};
	   int ANDEquation:: restoreY(std::vector <int> A)
          {
        for(auto i=A.begin();i!=A.end();i++)
        {
        int c  =-1;
        for(auto j =A.begin();j!=A.end();j++)
        {
            if(i!=j)
            {
                c = c&(*j);
            }
            
        }
        if(c == *i)
        {
            return *i;
        }
     }

    return -1;
    }
